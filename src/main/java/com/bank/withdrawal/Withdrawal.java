package com.bank.withdrawal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="withdrawal")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Withdrawal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "accountId")
	private String account_id;
	private Double amount;
	@Column(name = "creationdate")
	private String creationDate;
}
