package com.example.app;

import com.voodoodyne.gwizard.hibernate.DbConfig;
import com.voodoodyne.gwizard.web.WebConfig;
import lombok.Data;

/**
 */
@Data
public class ExampleConfig {
	private String foo;

	private WebConfig web = new WebConfig();
	private DbConfig db = new DbConfig();
}