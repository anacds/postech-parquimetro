package com.fiap.parquimetro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.parquimetro.model.Fiscal;
import com.fiap.parquimetro.model.Usuario;
import com.fiap.parquimetro.service.FiscalService;

@RestController
@RequestMapping(value = "/fiscais")
public class FiscalController {
	
	@Autowired
	private FiscalService fiscalService;
	
	
	@GetMapping
	public List<Fiscal> obterTodos(){
		return this.fiscalService.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Fiscal obterPorId(@PathVariable String id) {
		return this.fiscalService.obterPorId(id);
	}

	@PostMapping
	public Fiscal criar(@RequestBody Fiscal fiscal) {
		return this.fiscalService.criar(fiscal);
		
	}
	
    @PutMapping("/{id}")
    public Fiscal atualizar(@PathVariable String id, @RequestBody Fiscal fiscalAtualizado) {
        return this.fiscalService.atualizar(id, fiscalAtualizado);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        fiscalService.deletar(id);
    }
	
	//endpoint para verificar a placa
    @GetMapping("/verificarPlaca/{placa}")
    public String verificarPlaca(@PathVariable String placa) {
        // Chama o método de busca de usuários no FiscalService
        List<Usuario> usuarios = fiscalService.buscarUsuariosPorPlaca(placa);

        if (usuarios.isEmpty()) {
            return "Nenhum usuário encontrado com a placa: " + placa;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Usuários encontrados com a placa " + placa + ":\n");
            for (Usuario usuario : usuarios) {
                sb.append("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + "\n");
            }
            return sb.toString();
        }
    }

}
