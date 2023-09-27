import org.junit.jupiter.api.Test

class PermissionManagerTest {
  @Test
  fun `getPermissionLevelName should return Admin when permission level is ADMIN`() {
    // Arrange
    val permissionManager = PermissionManager()
    permissionManager.setPermissionLevel(PermissionLevel.ADMIN)

    // Act
    val result = permissionManager.getPermissionLevelName()

    // Assert
    assert(result == "Admin")
  }

  @Test
  fun `getPermissionLevelName should return Developer when permission level is DEVELOPER`() {
    // Arrange
    val permissionManager = PermissionManager()
    permissionManager.setPermissionLevel(PermissionLevel.DEVELOPER)

    // Act
    val result = permissionManager.getPermissionLevelName()

    // Assert
    assert(result == "Developer")
  }

  @Test
  fun `getPermissionLevelName should return User when permission level is USER`() {
    // Arrange
    val permissionManager = PermissionManager()
    permissionManager.setPermissionLevel(PermissionLevel.USER)

    // Act
    val result = permissionManager.getPermissionLevelName()

    // Assert
    assert(result == "User")
  }

}