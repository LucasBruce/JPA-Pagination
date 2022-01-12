
		Pageable paginaUm = PageRequest.of(0, 10000, Sort.Direction.DESC, "createTime");
		Page<WakatimeUsuarioDTO> usuarios = this.wakatimeUsuarioRepository.findAll(paginaUm);
		int tamanhoPagina = (int) (usuarios.getTotalElements() - usuarios.getNumberOfElements());
		Pageable paginaDois = PageRequest.of(0, tamanhoPagina, Sort.Direction.ASC, "createTime");
		Page<WakatimeUsuarioDTO> usuariosDois = this.wakatimeUsuarioRepository.findAll(paginaDois);
		return usuarios;

