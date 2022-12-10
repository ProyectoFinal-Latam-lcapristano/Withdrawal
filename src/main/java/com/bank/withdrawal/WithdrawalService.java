package com.bank.withdrawal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WithdrawalService implements IWithdrawalService {

	@Autowired
	private WithdrawalRepository repository;
	
	@Override
	public List<Withdrawal> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Withdrawal> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Withdrawal save(Withdrawal withdrawal) {
		return repository.save(withdrawal);
	}

	@Override
	public void delete(Withdrawal withdrawal) {
		repository.delete(withdrawal);
		
	}

}
