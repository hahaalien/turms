(window.webpackJsonp=window.webpackJsonp||[]).push([[12],{205:function(s,t,a){"use strict";a.r(t);var e=a(0),r=Object(e.a)({},(function(){var s=this,t=s.$createElement,a=s._self._c||t;return a("ContentSlotsDistributor",{attrs:{"slot-key":s.$parent.slotKey}},[a("h3",{attrs:{id:"配置参数"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#配置参数"}},[s._v("#")]),s._v(" 配置参数")]),s._v(" "),a("h4",{attrs:{id:"重要性"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#重要性"}},[s._v("#")]),s._v(" 重要性")]),s._v(" "),a("p",[s._v("即时通讯的业务场景繁多，因此不同业务对硬件资源有着"),a("strong",[s._v("天差地别")]),s._v("的要求。 为了有效利用服务器资源，请务必细心了解Turms服务端所提供的配置参数。")]),s._v(" "),a("p",[s._v("以一个场景为例： A应用是一款主要面向商务客户的即时通讯应用。这款应用有一个需求：当一名用户在商务群发出一条消息后，该用户能够得知群组的其他"),a("strong",[s._v("每一名用户")]),s._v("是否已读该消息，就算该用户发完消息就下线了，当其再次上线时，仍能查询其他人对该消息的已读状态。 而B应用是一款直播弹幕聊天应用，它对消息的处理非常随意。当一名用户在一个直播频道发出一条消息后，该用户不仅无需得知其他用户的已读状态，甚至连消息本身都不要求存储（即无离线消息需求）")]),s._v(" "),a("p",[s._v("以上两个场景，直接决定了Turms是否需要存储Message与MessageStatus。对于A应用，如果一个商务群有100名用户，当其中一名用户发出一条消息时，Turms需要存储1条Message与99条MessageStatus记录。对于B应用，如果一个直播频道有100名，当其中一名用户发出一条消息时，Turms需要存储0条Message与0条MessageStatus记录。因此二者对硬件需求有质的不同。")]),s._v(" "),a("h4",{attrs:{id:"具体属性说明"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#具体属性说明"}},[s._v("#")]),s._v(" 具体属性说明")]),s._v(" "),a("p",[s._v("可参考im.turms.turms.property目录下各配置类中属性的描述信息。")])])}),[],!1,null,null,null);t.default=r.exports}}]);