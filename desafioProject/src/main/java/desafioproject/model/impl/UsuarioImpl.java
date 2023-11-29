package desafioproject.model.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafioproject.model.VO.ListUsuariosOutVO;
import desafioproject.model.VO.RegPhonesInVO;
import desafioproject.model.VO.RegUsuarioInVO;
import desafioproject.model.VO.RegUsuarioOutVO;
import desafioproject.model.entity.Telefono;
import desafioproject.model.entity.Usuario;
import desafioproject.model.exception.domain.NotAcceptable;
import desafioproject.model.repository.TelefonoRepo;
import desafioproject.model.repository.UsuarioRepo;
import desafioproject.model.service.UsuarioService;
import static desafioproject.model.util.Constants.COD_ACTIVO_SI;
import static desafioproject.model.util.Constants.MSSG_CORREO_EXIST;

@Service
public class UsuarioImpl implements UsuarioService{
	
	@Autowired
	TelefonoRepo telefonoRepo;
	
	@Autowired
	UsuarioRepo usuarioRepo;

	@Override
	public RegUsuarioOutVO registrarUsuarios(RegUsuarioInVO bodyIn) throws NotAcceptable {
		if(usuarioRepo.findByCorreo(bodyIn.getEmail())!=null) {
			throw new NotAcceptable(MSSG_CORREO_EXIST);
		}
		Date horaReg = new Date();
		
		Usuario usuario = new Usuario();
		usuario.setNombre(bodyIn.getName());
		usuario.setCorreo(bodyIn.getEmail());
		usuario.setPass(bodyIn.getPassword());
		usuario.setFechaCreacion(horaReg);
		usuario.setFechaUltimoLogin(horaReg);
		usuario.setActivo(COD_ACTIVO_SI);
		usuarioRepo.save(usuario);
		
		for (RegPhonesInVO telefonoVO : bodyIn.getPhones()) {
			Telefono telefono = new Telefono();
			telefono.setUsuario(usuario);
			telefono.setNumero(telefonoVO.getNumber());
			telefono.setCodigoPais(telefonoVO.getContrycode());
			telefono.setCodigoCiudad(telefonoVO.getCitycode());
			telefonoRepo.save(telefono);
		}
		RegUsuarioOutVO regUsuarioOutVO = new RegUsuarioOutVO();
		regUsuarioOutVO.setId(usuario.getIdUsuario().toString());
		regUsuarioOutVO.setCreated(usuario.getFechaCreacion());
		regUsuarioOutVO.setModified(usuario.getFechaModificacion());
		regUsuarioOutVO.setLast_login(usuario.getFechaUltimoLogin());
		regUsuarioOutVO.setToken(usuario.getIdUsuario().toString());
		regUsuarioOutVO.setIsactive(usuario.isActivo());
		return regUsuarioOutVO;
	}

	@Override
	public List<ListUsuariosOutVO> listarUsuarios() throws NotAcceptable {
		List<ListUsuariosOutVO> bodyOut = new ArrayList<>();
		List<Usuario> usuarios = usuarioRepo.findAll();
		for (Usuario usuario : usuarios) {
			ListUsuariosOutVO usuarioVO = new ListUsuariosOutVO();
			usuarioVO.setIdUsuario(usuario.getIdUsuario().toString());
			usuarioVO.setNombre(usuario.getNombre());
			usuarioVO.setCorreo(usuario.getCorreo());
			usuarioVO.setActive(usuario.isActivo());
			bodyOut.add(usuarioVO);
		}
		return bodyOut;
	}
}
