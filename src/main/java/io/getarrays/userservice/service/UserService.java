package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import java.util.List;

public interface UserService {

  /**
   * Saved user in database.
   *
   * @param user {@link User}
   * @return user {@link User}
   */
  User saveUser(User user);

  /**
   * Saved role in database.
   *
   * @param role {@link Role}
   * @return role {@link Role}
   */
  Role saveRole(Role role);

  /**
   * Added role to user.
   *
   * @param username user name
   * @param roleName role name
   */
  void addRoleToUser(String username, String roleName);

  /**
   * Fetch user by user name.
   *
   * @param userName user name
   * @return user {@link User}
   */
  User getUser(String userName);

  /**
   * Fetch all users.
   *
   * @return list of users {@link User}
   */
  List<User> getUsers();

}
