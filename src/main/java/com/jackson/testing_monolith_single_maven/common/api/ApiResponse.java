/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.common.api;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * ApiResponse Class.
 * <p>
 * </p>
 *
 * @author
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private boolean success;
    private T data;
    private String message;

    public static ApiResponse success(Object data, String message) {
        return new ApiResponse(true, data, message);
    }

    public static ApiResponse error(String message) {
        return new ApiResponse(false, null, message);
    }

    public ApiResponse(boolean success, String message){
        this.success = success;
        this.message = message;
    }

    public ApiResponse(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public ApiResponse(){}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}