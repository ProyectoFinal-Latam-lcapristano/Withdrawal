package com.bank.withdrawal;

import java.util.List;
import java.util.Optional;


public interface IWithdrawalService {
	public List<Withdrawal> findAll();
	public Optional<Withdrawal> findById(Long id);
	public Withdrawal save(Withdrawal withdrawal);
	public void delete(Withdrawal withdrawal);
}
