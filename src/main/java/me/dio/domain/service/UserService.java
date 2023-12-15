package me.dio.domain.service;

import me.dio.domain.model.User;

// Quando crio um service e depois crio uma classe de implementação isso me permite ter mais
// segurança, ou seja, aqui estou deixando somente o contrato para ser usado, mas não mostro
// minha implementação. Não estou expondo minhas regras.

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
