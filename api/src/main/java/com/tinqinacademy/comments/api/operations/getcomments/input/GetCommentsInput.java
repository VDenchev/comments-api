package com.tinqinacademy.comments.api.operations.getcomments.input;

import com.fasterxml.jackson.annotation.JsonValue;
import com.tinqinacademy.comments.api.base.OperationInput;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class GetCommentsInput implements OperationInput {

  @Schema(example = "Room UUID")
  @JsonValue
  private String roomId;
}
