package com.OpenSIMS;

import com.OpenSIMS.model.User;
import com.OpenSIMS.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@TestPropertySource("classpath:application-test.properties")
@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void saveUser() {
        User user = User.builder()
                .firstName("Buhari")
                .lastName("Ahmad")
                .username("maher")
                .email("buhari@gmail.com")
                .password("maher")
                .role("ADMIN")
                .build();

        userRepository.save(user);
        assertThat(userRepository.findByUsername("maher").isPresent()).isTrue();
    }

    @Test
    void deleteOwners() {
        User user = User.builder()
                .firstName("Buhari")
                .lastName("Ahmad")
                .username("maher")
                .email("buhari@gmail.com")
                .password("maher")
                .role("ADMIN")
                .build();
        userRepository.save(user);
        userRepository.deleteAll();
        assertThat(userRepository.count()).isEqualTo(0);

    }


}

