package com.geoni.jpamysql;
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // mysql�� AUTO_INCREMENT�� �״�� ���
	private Long id;
	
	@Column(nullable = false)
	private String account;
	
	private String email;
	
	private String phoneNumber;
	
	@Column(nullable = false)
	private LocalDateTime createdAt;
	
	@Column(nullable = false)
	private String createdBy;
	
	private LocalDateTime updatedAt;
	
	private String updatedBy; }
}

