package desafioproject.model.service;

import java.util.List;

import desafioproject.model.VO.ListUsuariosOutVO;
import desafioproject.model.VO.RegUsuarioInVO;
import desafioproject.model.VO.RegUsuarioOutVO;
import desafioproject.model.exception.domain.NotAcceptable;

public interface UsuarioService {
	RegUsuarioOutVO registrarUsuarios(RegUsuarioInVO bodyIn) throws NotAcceptable;
	List<ListUsuariosOutVO> listarUsuarios() throws NotAcceptable;
}
