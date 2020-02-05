package com.ramostear.unaboot.common.util;

import java.util.stream.Collectors;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindingResult;

/**
 * @author <a href="mailto:xiaoquanidea@163.com">Aiden</a>
 * @since 2020-02-05 2:16
 */
public class BindingResultHelper {

  public static String getDefaultErrorMessage(BindingResult bindingResult){
    if (bindingResult.hasFieldErrors()) {
    return bindingResult.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(
        Collectors.joining(", ","[","]"));
    }
    return "";
  }

}
