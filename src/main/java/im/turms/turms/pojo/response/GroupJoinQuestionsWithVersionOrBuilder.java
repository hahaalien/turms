// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response/group/group_join_questions_with_version.proto

package im.turms.turms.pojo.response;

public interface GroupJoinQuestionsWithVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.GroupJoinQuestionsWithVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .im.turms.proto.GroupJoinQuestion group_join_questions = 1;</code>
   */
  java.util.List<im.turms.turms.pojo.dto.GroupJoinQuestion> 
      getGroupJoinQuestionsList();
  /**
   * <code>repeated .im.turms.proto.GroupJoinQuestion group_join_questions = 1;</code>
   */
  im.turms.turms.pojo.dto.GroupJoinQuestion getGroupJoinQuestions(int index);
  /**
   * <code>repeated .im.turms.proto.GroupJoinQuestion group_join_questions = 1;</code>
   */
  int getGroupJoinQuestionsCount();
  /**
   * <code>repeated .im.turms.proto.GroupJoinQuestion group_join_questions = 1;</code>
   */
  java.util.List<? extends im.turms.turms.pojo.dto.GroupJoinQuestionOrBuilder> 
      getGroupJoinQuestionsOrBuilderList();
  /**
   * <code>repeated .im.turms.proto.GroupJoinQuestion group_join_questions = 1;</code>
   */
  im.turms.turms.pojo.dto.GroupJoinQuestionOrBuilder getGroupJoinQuestionsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  boolean hasLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  com.google.protobuf.Int64Value getLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder();
}
