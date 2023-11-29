package desafioproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import desafioproject.model.VO.ListUsuariosOutVO;
import desafioproject.model.VO.RegUsuarioInVO;
import desafioproject.model.VO.RegUsuarioOutVO;
import desafioproject.model.exception.domain.InternalServerError;
import desafioproject.model.exception.domain.NotAcceptable;
import desafioproject.model.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioServ;
	
	@PostMapping("/registro")
	@Transactional(rollbackFor = Exception.class)
	public RegUsuarioOutVO registrarUsuario(@RequestBody RegUsuarioInVO bodyIn) throws NotAcceptable, InternalServerError {
		return usuarioServ.registrarUsuarios(bodyIn);
	}
	@GetMapping("/listar")
	@Transactional(rollbackFor = Exception.class)
	public List<ListUsuariosOutVO> listarUsuario() throws NotAcceptable, InternalServerError {
		return usuarioServ.listarUsuarios();
	}
}

