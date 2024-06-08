package com.project.EpicByte.service;

import com.project.EpicByte.model.dto.UserRegisterDTO;
import com.project.EpicByte.model.dto.UserUpdateDTO;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

public interface UserService {
    String showLoginPage();
    String handleLoginError(Model model);
    String showRegisterPage(Model model);
    String registerUser(UserRegisterDTO userRegisterDTO, Model model, BindingResult bindingResult);
    String showProfilePage(Model model, Principal principal);
    String updateProfilePage(UserUpdateDTO userUpdateDTO, Model model, RedirectAttributes redirectAttributes, Principal principal);
}
