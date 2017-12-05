package com.mryao.gxkygl.common.exception;

import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/20 14:58
 * @Description:
 * @Version: 1.0
 */
public class FieldErrorsException extends RuntimeException {
    private List<FieldError> fieldErrors;

    public FieldErrorsException(String msg, List<FieldError> fieldErrors) {
        super(msg);
        this.fieldErrors = fieldErrors;
    }

    public List<FieldError> getFieldErrors() {
        return fieldErrors;
    }

    public void setFieldErrors(List<FieldError> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }
}
