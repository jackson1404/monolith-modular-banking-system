/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * AuditorAwareImpl Class.
 * <p>
 * </p>
 *
 * @author
 */

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("SYSTEM");
    }
}
