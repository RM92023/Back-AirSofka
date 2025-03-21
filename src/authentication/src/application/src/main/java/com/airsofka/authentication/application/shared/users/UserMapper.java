package com.airsofka.authentication.application.shared.users;

import com.airsofka.authentication.application.registeruser.RegisterUserRequest;
import com.airsofka.authentication.domain.user.User;
import com.airsofka.authentication.domain.user.values.DocumentID;
import com.airsofka.authentication.domain.user.values.Email;
import com.airsofka.authentication.domain.user.values.Nacionality;
import com.airsofka.authentication.domain.user.values.Name;
import com.airsofka.authentication.domain.user.values.Password;
import com.airsofka.authentication.domain.user.values.PhoneNumber;

public class UserMapper {

    public static User mapperLocal(RegisterUserRequest userRequest){
        User user = new User();
        user.setName(Name.of(userRequest.getName()));
        user.setEmail(Email.of(userRequest.getEmail()));
        user.setPassword(Password.of(userRequest.getPassword()));
        user.setDocumentID(DocumentID.of(userRequest.getDocumentId()));
        user.setPhoneNumber(PhoneNumber.of(userRequest.getPhoneNumber()));
        user.setNacionality(Nacionality.of(userRequest.getNacionality()));
        return user;
    }

    public static User mapperGoogle(RegisterUserRequest userRequest){
        User user = new User();
        user.setName(Name.of(userRequest.getName()));
        user.setEmail(Email.of(userRequest.getEmail()));
        return user;
    }

    public static UserResponse mapperUserResponse(User user){
        return new UserResponse(
                user.getIdentity().getValue(),
                user.getName().getValue(),
                user.getEmail().getValue(),
                user.getDocumentID()!= null? user.getDocumentID().getValue() : null,
                user.getPhoneNumber()!= null? user.getPhoneNumber().getValue() : null,
                user.getNacionality()!= null? user.getNacionality().getValue() : null,
                user.getMethodAuthentication().getValue(),
                user.getState().getValue(),
                user.getRole().getValue(),
                user.getIsFrequent().getValue(),
                user.getIsAuthenticated().getValue()
        );
    }
}
