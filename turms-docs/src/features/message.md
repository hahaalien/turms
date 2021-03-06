### 业务消息类型

#### 提醒

虽然Turms服务端默认支持传递与存储图片、视频、文件等数据，但极其不推荐使用此实现方案。
推荐的实现方案是使用CDN技术。客户端向您的服务服务端程序请求CDN许可Token，由客户端将带着这个Token找到CDN并上传文件到CDN上，并拿着从CDN那返回的文件URL传递给Turms服务端，由Turms保存这个URL文本，而不保留文件的二进制数据。

又或者通过实现Turms插件来自主定制与部署文件管理服务端集群。

### 业务消息类型

从开发者角度看，Turms在数据传输时仅使用一种数据结构，它自身可以携带string与List<byte[]>数据结构。因此，您实际上能通过Turms传输任何东西，以下列表仅是Turms为常见业务消息提供的便捷划分。

提醒：Turms的消息（所有业务类型的消息）均可以标记为系统消息

| **业务消息类型** | **描述**                                                     |
| :--------------- | :----------------------------------------------------------- |
| 文本消息         | 消息内容为文本<br />提醒：文本也可以是JSON，没有限制         |
| 图片消息         | 消息内容为描述部分（可选）：图片 URL 地址、尺寸、图片大小<br />图片数据（可选） |
| 语音消息         | 消息内容为描述部分（可选）：语音文件的 URL 地址、时长、大小、格式<br />语音数据（可选）<br /> |
| 视频消息         | 消息内容为描述部分（可选）：视频文件的 URL 地址、时长、大小、格式<br />视频数据（可选）<br /> |
| 文件消息         | 消息内容为描述部分（可选）：文件的 URL 地址、大小、格式<br />文件数据（可选）<br />默认最大支持 16 MB |
| 地理位置消息     | 消息内容为地理位置标题、地址、经度、纬度信息                 |
| 组合消息         | 消息内容为文本信息与任意个数的其他任意内容类消息类型的消息（如：一条消息既包含了文本，也包含了图片与音频） |
| 自定义消息       | Turms在传输时仅使用一种数据结构，它自身可以携带string与List<byte[]>数据结构。因此开发者可以自由实现任意的自定义消息类型，例如红包消息、石头剪子布等形式的消息 |

### 消息功能

配置属性类：im.turms.turms.property.business.Message

| **消息功能** | **功能描述**                                                 | **相关配置**                                                 |
| :----------- | :----------------------------------------------------------- | ------------------------------------------------------------ |
| 离线消息     | 实现思路：您可以在Turms客户端每次登陆时，都<主动>向Turms服务端请求关于<该用户在离线状态时，收到的所有私聊与群聊各自具体的离线消息数量，以及各自具体的最后N条消息（默认为1条）>的数据，以此同时兼顾消息的实时性与服务的性能。 默认情况下，Turms服务端<不会>定时删除寄存在Turms服务端的任何离线消息 | defaultAvailableMessagesNumberWithTotal                      |
| 漫游消息     | ✍在新设备登录时，由开发者自行调用Turms客户端的消息查询接口，指定数量与时段等条件，向Turms服务端请求漫游消息。<br />漫游消息的实现本质与“历史消息”的实现一样<br />（✍原因：Turms无法自行判断什么是“新设备登陆”） |                                                              |
| 多端同步     | 当一名用户有多客户端同时在线时，Turms服务端会将消息下发给该用户所有在线的客户端 |                                                              |
| 历史消息     | 支持查询用户的历史消息。默认Turms永久存储消息（包括用户消息或系统消息）<br />历史消息的实现本质与“漫游消息”的实现一样 |                                                              |
| 发送消息     |                                                              | timeType<br />checkIfTargetActiveAndNotDeleted<br />maxTextLimit<br />maxRecordsSizeBytes<br />messagePersistent<br />recordsPersistent<br />messageStatusPersistent<br />messageTimeToLiveHours<br /><br />allowSendingMessagesToStranger<br /><br />allowSendingMessagesToOneself<br /><br />shouldDeleteMessageLogicallyByDefault<br />shouldDeletePrivateMessageAfterAcknowledged |
| 消息撤回     | 撤回投递成功的消息，默认允许发信人撤回距投递成功时间 5 分钟内的消息 | allowRecallingMessage<br />availableRecallDurationSeconds    |
| 消息编辑     | 编辑已发送成功的消息                                         | allowEditingMessageBySender                                  |
| 阅后即焚     | 收信人接收到发信人的消息后，收信人客户端会根据发信人预先设定（或默认）的时间按时自动销毁 |                                                              |
| 已读回执     | ✍通知私聊对象或群组成员中，当前用户已读某条消息<br />查看私聊、群组会话中对方的已读/未读状态<br />（✍原因：Turms无法得知您的用户在什么情况下算是“已读某条消息”。开发者需要自行调用turmsClient.messageService.readMessage()来告知对方，当前用户已读某条消息） | shouldUpdateReadDateWhenUserQueryingMessage<br />ReadReceipt.enabled<br />ReadReceipt.useServerTime |
| 消息转发     | 将消息转发给其他用户或群组                                   |                                                              |
| @某人        | 用于特别提醒某用户。如果Turms客户端检测到已接收的消息中被@的用户为当前登陆中的用户，Turms客户端则会触发@回调函数。开发者可自行实现后续相关业务逻辑。常用于给被@的用户提醒通知。<br />群内 @ 消息与普通消息没有本质区别，仅是在被 @ 的人在收到消息时，需要做特殊处理（触发回调函数） |                                                              |
| 正在输入     | ✍当通信中的一方正在键入文本时，告知收信人（一名或多名用户），该用户正在输入消息<br />（✍原因：Turms无法得知您的用户是否正在键入文本） | TypingStatus.enabled                                         |
