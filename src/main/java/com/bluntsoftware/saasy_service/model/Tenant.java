package com.bluntsoftware.saasy_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Tenant {
	@Id
	private String id;
	private String owner;
    private User customer;
	private String displayName;
	private List<User> users; // do we need this ?
	private String planId;
	private IdName app;
	private String subscriptionId;
}
