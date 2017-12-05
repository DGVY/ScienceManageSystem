package com.mryao.gxkygl.common.exception.Handler;

import com.mryao.gxkygl.common.exception.FieldErrorsException;
import com.mryao.gxkygl.common.result.Result;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/20 14:53
 * @Description:
 * @Version: 1.0
 */
@Component
public class FieldErrorExceptionHandler implements ExceptionHandler{
    @Override
    public Object handler(HttpServletResponse response, Throwable e) {
        if(e instanceof FieldErrorsException){
            Result result = Result.getError("字段验证错误!");
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            FieldErrorsException fieldErrorsException  = (FieldErrorsException) e;
            List<FieldError> fieldErrors = fieldErrorsException.getFieldErrors();
            List<Map> errors = new ArrayList<>();
            for(FieldError fieldError: fieldErrors){
                Map<String,String> error = new HashMap<>();
                error.put("msg",fieldError.getDefaultMessage());
                error.put("field",fieldError.getField());
                errors.add(error);
            }
            result.setErrors(errors);
            return result;
        }else {
            return null;
        }
    }
}
