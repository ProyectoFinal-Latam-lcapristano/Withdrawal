package com.bank.withdrawal;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class WithdrawalController {
	@Autowired
	private WithdrawalService service;
	
	@GetMapping("/list")
	public List<Withdrawal> listar(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Withdrawal> buscarPorId(Long id){
		return service.findById(id);
	}
	
	@PostMapping()
	public ResponseEntity<Map<String, Object>> guardar(@RequestBody Withdrawal withdrawal){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("Transacción", "Deposito");
		result.put("Mensaje", "Deposito realizado");
		
		Withdrawal withdrawalsave = service.save(withdrawal);
		result.put("Deposito realizado", withdrawalsave);
		
		return ResponseEntity.created(URI.create("/".concat(withdrawalsave.getId().toString())))
				.contentType(MediaType.APPLICATION_JSON).body(result); 
	} 
}
