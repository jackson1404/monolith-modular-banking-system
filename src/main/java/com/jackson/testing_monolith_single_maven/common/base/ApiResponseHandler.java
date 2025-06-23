/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.common.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;

/**
 * ResponseHandler Class.
 * <p>
 * </p>
 *
 * @author
 */

public abstract class ResponseHandler {

    public <T> ResponseEntity<ApiResponse<T>> ok(T data, String message) {
        return ResponseEntity.ok(ApiResponse.success(data, message));
    }

    public ResponseEntity<ApiResponse<?>> fail(String message) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponse.error(message));
    }

    public ResponseEntity<ApiResponse<?>> created(String message) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(null, message));
    }




}
