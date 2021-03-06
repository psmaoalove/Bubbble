package com.imangazalievm.bubbble.domain.interactors;


import com.imangazalievm.bubbble.domain.models.Shot;
import com.imangazalievm.bubbble.domain.models.User;
import com.imangazalievm.bubbble.domain.models.UserShotsRequestParams;
import com.imangazalievm.bubbble.domain.repository.ShotsRepository;
import com.imangazalievm.bubbble.domain.repository.UsersRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class UserShotsInteractor {

    private UsersRepository usersRepository;
    private ShotsRepository shotsRepository;

    @Inject
    public UserShotsInteractor(UsersRepository usersRepository, ShotsRepository shotsRepository) {
        this.usersRepository = usersRepository;
        this.shotsRepository = shotsRepository;
    }

    public Single<User> getUser(long userId) {
        return usersRepository.getUser(userId);
    }

    public Single<List<Shot>> getUserShots(UserShotsRequestParams requestParams) {
        return shotsRepository.getUserShots(requestParams);
    }

}
