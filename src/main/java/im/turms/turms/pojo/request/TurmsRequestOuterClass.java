// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/turms_request.proto

package im.turms.turms.pojo.request;

public final class TurmsRequestOuterClass {
  private TurmsRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_TurmsRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_TurmsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033request/turms_request.proto\022\016im.turms." +
      "proto\032\036google/protobuf/wrappers.proto\032 r" +
      "equest/signal/ack_request.proto\0327request" +
      "/user/query_user_group_invitations_reque" +
      "st.proto\032-request/user/query_user_profil" +
      "e_request.proto\0321request/user/query_user" +
      "s_ids_nearby_request.proto\0323request/user" +
      "/query_users_infos_nearby_request.proto\032" +
      "4request/user/query_users_online_status_" +
      "request.proto\032/request/user/update_user_" +
      "location_request.proto\0324request/user/upd" +
      "ate_user_online_status_request.proto\032&re" +
      "quest/user/update_user_request.proto\032=re" +
      "quest/user/relationship/create_friend_re" +
      "quest_request.proto\032Arequest/user/relati" +
      "onship/create_relationship_group_request" +
      ".proto\032;request/user/relationship/create" +
      "_relationship_request.proto\032Arequest/use" +
      "r/relationship/delete_relationship_group" +
      "_request.proto\032;request/user/relationshi" +
      "p/delete_relationship_request.proto\032=req" +
      "uest/user/relationship/query_friend_requ" +
      "ests_request.proto\032?request/user/relatio" +
      "nship/query_related_users_ids_request.pr" +
      "oto\032Arequest/user/relationship/query_rel" +
      "ationship_groups_request.proto\032;request/" +
      "user/relationship/query_relationships_re" +
      "quest.proto\032=request/user/relationship/u" +
      "pdate_friend_request_request.proto\032Arequ" +
      "est/user/relationship/update_relationshi" +
      "p_group_request.proto\032;request/user/rela" +
      "tionship/update_relationship_request.pro" +
      "to\032(request/group/create_group_request.p" +
      "roto\032(request/group/delete_group_request" +
              ".proto\032'request/group/query_group_reques" +
      "t.proto\0323request/group/query_joined_grou" +
      "ps_ids_request.proto\0325request/group/quer" +
      "y_joined_groups_infos_request.proto\032(req" +
      "uest/group/update_group_request.proto\032Cr" +
      "equest/group/blacklist/create_group_blac" +
      "klisted_user_request.proto\032Crequest/grou" +
      "p/blacklist/delete_group_blacklisted_use" +
      "r_request.proto\032Grequest/group/blacklist" +
      "/query_group_blacklisted_users_ids_reque" +
      "st.proto\032Irequest/group/blacklist/query_" +
      "group_blacklisted_users_infos_request.pr" +
      "oto\032Grequest/group/enrollment/check_grou" +
      "p_join_question_answer_request.proto\032>re" +
      "quest/group/enrollment/create_group_invi" +
      "tation_request.proto\032@request/group/enro" +
      "llment/create_group_join_request_request" +
      ".proto\032Arequest/group/enrollment/create_" +
      "group_join_question_request.proto\032>reque" +
      "st/group/enrollment/delete_group_invitat" +
      "ion_request.proto\032@request/group/enrollm" +
      "ent/delete_group_join_request_request.pr" +
      "oto\032Arequest/group/enrollment/delete_gro" +
      "up_join_question_request.proto\032>request/" +
      "group/enrollment/query_group_invitations" +
      "_request.proto\032@request/group/enrollment" +
      "/query_group_join_requests_request.proto" +
      "\032Arequest/group/enrollment/query_group_j" +
      "oin_questions_request.proto\032Arequest/gro" +
      "up/enrollment/update_group_join_question" +
      "_request.proto\0326request/group/member/cre" +
      "ate_group_member_request.proto\0326request/" +
      "group/member/delete_group_member_request" +
      ".proto\0326request/group/member/query_group" +
      "_members_request.proto\0326request/group/me" +
      "mber/update_group_member_request.proto\032," +
      "request/message/create_message_request.p" +
      "roto\0322request/message/query_message_stat" +
      "us_request.proto\032,request/message/query_" +
      "messages_request.proto\032?request/message/" +
      "query_pending_messages_with_total_reques" +
      "t.proto\032,request/message/update_message_" +
      "request.proto\0322request/message/update_ty" +
      "ping_status_request.proto\"\244$\n\014TurmsReque" +
      "st\022/\n\nrequest_id\030\001 \001(\0132\033.google.protobuf" +
      ".Int64Value\0221\n\014requester_id\030\002 \001(\0132\033.goog" +
      "le.protobuf.Int64Value\0221\n\013ack_request\030\003 " +
      "\001(\0132\032.im.turms.proto.AckRequestH\000\022F\n\026cre" +
      "ate_message_request\030\005 \001(\0132$.im.turms.pro" +
      "to.CreateMessageRequestH\000\022Q\n\034query_messa" +
      "ge_status_request\030\006 \001(\0132).im.turms.proto" +
      ".QueryMessageStatusRequestH\000\022F\n\026query_me" +
      "ssages_request\030\007 \001(\0132$.im.turms.proto.Qu" +
      "eryMessagesRequestH\000\022i\n)query_pending_me" +
      "ssages_with_total_request\030\010 \001(\01324.im.tur" +
      "ms.proto.QueryPendingMessagesWithTotalRe" +
      "questH\000\022F\n\026update_message_request\030\t \001(\0132" +
      "$.im.turms.proto.UpdateMessageRequestH\000\022" +
      "Q\n\034update_typing_status_request\030\n \001(\0132)." +
      "im.turms.proto.UpdateTypingStatusRequest" +
      "H\000\022`\n$query_user_group_invitations_reque" +
      "st\030d \001(\01320.im.turms.proto.QueryUserGroup" +
      "InvitationsRequestH\000\022M\n\032query_user_profi" +
              "le_request\030e \001(\0132'.im.turms.proto.QueryU" +
      "serProfileRequestH\000\022T\n\036query_users_ids_n" +
      "earby_request\030f \001(\0132*.im.turms.proto.Que" +
      "ryUsersIdsNearbyRequestH\000\022X\n query_users" +
      "_infos_nearby_request\030g \001(\0132,.im.turms.p" +
      "roto.QueryUsersInfosNearbyRequestH\000\022Z\n!q" +
      "uery_users_online_status_request\030h \001(\0132-" +
      ".im.turms.proto.QueryUsersOnlineStatusRe" +
      "questH\000\022Q\n\034update_user_location_request\030" +
      "i \001(\0132).im.turms.proto.UpdateUserLocatio" +
      "nRequestH\000\022Z\n!update_user_online_status_" +
      "request\030j \001(\0132-.im.turms.proto.UpdateUse" +
      "rOnlineStatusRequestH\000\022@\n\023update_user_re" +
      "quest\030k \001(\0132!.im.turms.proto.UpdateUserR" +
      "equestH\000\022T\n\035create_friend_request_reques" +
      "t\030\310\001 \001(\0132*.im.turms.proto.CreateFriendRe" +
      "questRequestH\000\022\\\n!create_relationship_gr" +
      "oup_request\030\311\001 \001(\0132..im.turms.proto.Crea" +
      "teRelationshipGroupRequestH\000\022Q\n\033create_r" +
      "elationship_request\030\312\001 \001(\0132).im.turms.pr" +
      "oto.CreateRelationshipRequestH\000\022\\\n!delet" +
      "e_relationship_group_request\030\313\001 \001(\0132..im" +
      ".turms.proto.DeleteRelationshipGroupRequ" +
      "estH\000\022Q\n\033delete_relationship_request\030\314\001 " +
      "\001(\0132).im.turms.proto.DeleteRelationshipR" +
      "equestH\000\022T\n\035query_friend_requests_reques" +
      "t\030\315\001 \001(\0132*.im.turms.proto.QueryFriendReq" +
      "uestsRequestH\000\022W\n\037query_related_users_id" +
      "s_request\030\316\001 \001(\0132+.im.turms.proto.QueryR" +
      "elatedUsersIdsRequestH\000\022\\\n!query_relatio" +
      "nship_groups_request\030\317\001 \001(\0132..im.turms.p" +
      "roto.QueryRelationshipGroupsRequestH\000\022Q\n" +
      "\033query_relationships_request\030\320\001 \001(\0132).im" +
      ".turms.proto.QueryRelationshipsRequestH\000" +
      "\022T\n\035update_friend_request_request\030\321\001 \001(\013" +
      "2*.im.turms.proto.UpdateFriendRequestReq" +
      "uestH\000\022\\\n!update_relationship_group_requ" +
      "est\030\322\001 \001(\0132..im.turms.proto.UpdateRelati" +
      "onshipGroupRequestH\000\022Q\n\033update_relations" +
      "hip_request\030\323\001 \001(\0132).im.turms.proto.Upda" +
      "teRelationshipRequestH\000\022C\n\024create_group_" +
      "request\030\254\002 \001(\0132\".im.turms.proto.CreateGr" +
      "oupRequestH\000\022C\n\024delete_group_request\030\255\002 " +
      "\001(\0132\".im.turms.proto.DeleteGroupRequestH" +
      "\000\022A\n\023query_group_request\030\256\002 \001(\0132!.im.tur" +
      "ms.proto.QueryGroupRequestH\000\022W\n\037query_jo" +
      "ined_groups_ids_request\030\257\002 \001(\0132+.im.turm" +
      "s.proto.QueryJoinedGroupsIdsRequestH\000\022[\n" +
      "!query_joined_groups_infos_request\030\260\002 \001(" +
      "\0132-.im.turms.proto.QueryJoinedGroupsInfo" +
      "sRequestH\000\022C\n\024update_group_request\030\261\002 \001(" +
      "\0132\".im.turms.proto.UpdateGroupRequestH\000\022" +
      "c\n%create_group_blacklisted_user_request" +
      "\030\220\003 \001(\01321.im.turms.proto.CreateGroupBlac" +
      "klistedUserRequestH\000\022c\n%delete_group_bla" +
      "cklisted_user_request\030\221\003 \001(\01321.im.turms." +
      "proto.DeleteGroupBlacklistedUserRequestH" +
      "\000\022j\n)query_group_blacklisted_users_ids_r" +
      "equest\030\222\003 \001(\01324.im.turms.proto.QueryGrou" +
      "pBlacklistedUsersIdsRequestH\000\022n\n+query_g" +
      "roup_blacklisted_users_infos_request\030\223\003 " +
      "\001(\01326.im.turms.proto.QueryGroupBlacklist" +
      "edUsersInfosRequestH\000\022h\n(check_group_joi" +
      "n_question_answer_request\030\364\003 \001(\01323.im.tu" +
      "rms.proto.CheckGroupJoinQuestionAnswerRe" +
      "questH\000\022X\n\037create_group_invitation_reque" +
      "st\030\365\003 \001(\0132,.im.turms.proto.CreateGroupIn" +
      "vitationRequestH\000\022[\n!create_group_join_r" +
      "equest_request\030\366\003 \001(\0132-.im.turms.proto.C" +
      "reateGroupJoinRequestRequestH\000\022]\n\"create" +
      "_group_join_question_request\030\367\003 \001(\0132..im" +
      ".turms.proto.CreateGroupJoinQuestionRequ" +
      "estH\000\022X\n\037delete_group_invitation_request" +
      "\030\370\003 \001(\0132,.im.turms.proto.DeleteGroupInvi" +
      "tationRequestH\000\022[\n!delete_group_join_req" +
      "uest_request\030\371\003 \001(\0132-.im.turms.proto.Del" +
      "eteGroupJoinRequestRequestH\000\022]\n\"delete_g" +
      "roup_join_question_request\030\372\003 \001(\0132..im.t" +
      "urms.proto.DeleteGroupJoinQuestionReques" +
      "tH\000\022X\n\037query_group_invitations_request\030\373" +
      "\003 \001(\0132,.im.turms.proto.QueryGroupInvitat" +
      "ionsRequestH\000\022[\n!query_group_join_reques" +
      "ts_request\030\374\003 \001(\0132-.im.turms.proto.Query" +
      "GroupJoinRequestsRequestH\000\022]\n\"query_grou" +
      "p_join_questions_request\030\375\003 \001(\0132..im.tur" +
      "ms.proto.QueryGroupJoinQuestionsRequestH" +
      "\000\022]\n\"update_group_join_question_request\030" +
      "\376\003 \001(\0132..im.turms.proto.UpdateGroupJoinQ" +
      "uestionRequestH\000\022P\n\033create_group_member_" +
      "request\030\330\004 \001(\0132(.im.turms.proto.CreateGr" +
      "oupMemberRequestH\000\022P\n\033delete_group_membe" +
      "r_request\030\331\004 \001(\0132(.im.turms.proto.Delete" +
      "GroupMemberRequestH\000\022P\n\033query_group_memb" +
      "ers_request\030\332\004 \001(\0132(.im.turms.proto.Quer" +
      "yGroupMembersRequestH\000\022P\n\033update_group_m" +
      "ember_request\030\333\004 \001(\0132(.im.turms.proto.Up" +
      "dateGroupMemberRequestH\000B\006\n\004kindB\037\n\033im.t" +
      "urms.turms.pojo.requestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          im.turms.turms.pojo.request.AckRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryUserGroupInvitationsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryUserProfileRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryUsersIdsNearbyRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryUsersInfosNearbyRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryUsersOnlineStatusRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateUserLocationRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateUserOnlineStatusRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateUserRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateFriendRequestRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateRelationshipGroupRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateRelationshipRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteRelationshipGroupRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteRelationshipRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryFriendRequestsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryRelatedUsersIdsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryRelationshipGroupsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryRelationshipsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateFriendRequestRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateRelationshipGroupRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateRelationshipRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateGroupRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteGroupRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryGroupRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryJoinedGroupsIdsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryJoinedGroupsInfosRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateGroupRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateGroupBlacklistedUserRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteGroupBlacklistedUserRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryGroupBlacklistedUsersIdsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryGroupBlacklistedUsersInfosRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CheckGroupJoinQuestionAnswerRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateGroupInvitationRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateGroupJoinRequestRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateGroupJoinQuestionRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteGroupInvitationRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteGroupJoinRequestRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteGroupJoinQuestionRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryGroupInvitationsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryGroupJoinRequestsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryGroupJoinQuestionsRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateGroupJoinQuestionRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateGroupMemberRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.DeleteGroupMemberRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryGroupMembersRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateGroupMemberRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.CreateMessageRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryMessageStatusRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryMessagesRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.QueryPendingMessagesWithTotalRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateMessageRequestOuterClass.getDescriptor(),
          im.turms.turms.pojo.request.UpdateTypingStatusRequestOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_TurmsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_TurmsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_TurmsRequest_descriptor,
        new java.lang.String[] { "RequestId", "RequesterId", "AckRequest", "CreateMessageRequest", "QueryMessageStatusRequest", "QueryMessagesRequest", "QueryPendingMessagesWithTotalRequest", "UpdateMessageRequest", "UpdateTypingStatusRequest", "QueryUserGroupInvitationsRequest", "QueryUserProfileRequest", "QueryUsersIdsNearbyRequest", "QueryUsersInfosNearbyRequest", "QueryUsersOnlineStatusRequest", "UpdateUserLocationRequest", "UpdateUserOnlineStatusRequest", "UpdateUserRequest", "CreateFriendRequestRequest", "CreateRelationshipGroupRequest", "CreateRelationshipRequest", "DeleteRelationshipGroupRequest", "DeleteRelationshipRequest", "QueryFriendRequestsRequest", "QueryRelatedUsersIdsRequest", "QueryRelationshipGroupsRequest", "QueryRelationshipsRequest", "UpdateFriendRequestRequest", "UpdateRelationshipGroupRequest", "UpdateRelationshipRequest", "CreateGroupRequest", "DeleteGroupRequest", "QueryGroupRequest", "QueryJoinedGroupsIdsRequest", "QueryJoinedGroupsInfosRequest", "UpdateGroupRequest", "CreateGroupBlacklistedUserRequest", "DeleteGroupBlacklistedUserRequest", "QueryGroupBlacklistedUsersIdsRequest", "QueryGroupBlacklistedUsersInfosRequest", "CheckGroupJoinQuestionAnswerRequest", "CreateGroupInvitationRequest", "CreateGroupJoinRequestRequest", "CreateGroupJoinQuestionRequest", "DeleteGroupInvitationRequest", "DeleteGroupJoinRequestRequest", "DeleteGroupJoinQuestionRequest", "QueryGroupInvitationsRequest", "QueryGroupJoinRequestsRequest", "QueryGroupJoinQuestionsRequest", "UpdateGroupJoinQuestionRequest", "CreateGroupMemberRequest", "DeleteGroupMemberRequest", "QueryGroupMembersRequest", "UpdateGroupMemberRequest", "Kind", });
    com.google.protobuf.WrappersProto.getDescriptor();
    im.turms.turms.pojo.request.AckRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryUserGroupInvitationsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryUserProfileRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryUsersIdsNearbyRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryUsersInfosNearbyRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryUsersOnlineStatusRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateUserLocationRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateUserOnlineStatusRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateUserRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateFriendRequestRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateRelationshipGroupRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateRelationshipRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteRelationshipGroupRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteRelationshipRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryFriendRequestsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryRelatedUsersIdsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryRelationshipGroupsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryRelationshipsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateFriendRequestRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateRelationshipGroupRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateRelationshipRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateGroupRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteGroupRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryGroupRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryJoinedGroupsIdsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryJoinedGroupsInfosRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateGroupRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateGroupBlacklistedUserRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteGroupBlacklistedUserRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryGroupBlacklistedUsersIdsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryGroupBlacklistedUsersInfosRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CheckGroupJoinQuestionAnswerRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateGroupInvitationRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateGroupJoinRequestRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateGroupJoinQuestionRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteGroupInvitationRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteGroupJoinRequestRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteGroupJoinQuestionRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryGroupInvitationsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryGroupJoinRequestsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryGroupJoinQuestionsRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateGroupJoinQuestionRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateGroupMemberRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.DeleteGroupMemberRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryGroupMembersRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateGroupMemberRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.CreateMessageRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryMessageStatusRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryMessagesRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.QueryPendingMessagesWithTotalRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateMessageRequestOuterClass.getDescriptor();
    im.turms.turms.pojo.request.UpdateTypingStatusRequestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
