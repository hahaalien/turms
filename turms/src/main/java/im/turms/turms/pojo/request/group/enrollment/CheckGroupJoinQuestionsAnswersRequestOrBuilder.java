// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/enrollment/check_group_join_questions_answers_request.proto

package im.turms.turms.pojo.request.group.enrollment;

public interface CheckGroupJoinQuestionsAnswersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.CheckGroupJoinQuestionsAnswersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */
  int getQuestionIdAndAnswerCount();
  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */
  boolean containsQuestionIdAndAnswer(
      long key);
  /**
   * Use {@link #getQuestionIdAndAnswerMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, java.lang.String>
  getQuestionIdAndAnswer();
  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */
  java.util.Map<java.lang.Long, java.lang.String>
  getQuestionIdAndAnswerMap();
  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */

  java.lang.String getQuestionIdAndAnswerOrDefault(
      long key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;int64, string&gt; question_id_and_answer = 1;</code>
   */

  java.lang.String getQuestionIdAndAnswerOrThrow(
      long key);
}
