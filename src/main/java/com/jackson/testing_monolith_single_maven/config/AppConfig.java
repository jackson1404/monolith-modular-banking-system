/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.config;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig Class.
 * <p>
 * </p>
 *
 * @author
 */
@Configuration
@RequiredArgsConstructor
public class AppConfig {

    private ModelMapper modelMapper;

    @Bean
    public ModelMapper modelMapper(){
        return modelMapper = new ModelMapper();
    }
}
