import org.junit.jupiter.api.Test

class PermissionManagerTest {
  @Test
  fun `getPermissionLevelName should return Admin when permission level is ADMIN`() {
    // Arrange
    val permissionManager = PermissionManager()
    val permissionLevel = PermissionLevel.ADMIN

    // Act
    val result = permissionManager.getPermissionLevelName(permissionLevel)

    // Assert
    assert(result == "Admin")
  }

  @Test
  fun `getPermissionLevelName should return Developer when permission level is DEVELOPER`() {
    // Arrange
    val permissionManager = PermissionManager()
    val permissionLevel = PermissionLevel.DEVELOPER

    // Act
    val result = permissionManager.getPermissionLevelName(permissionLevel)

    // Assert
    assert(result == "Developer")
  }

  @Test
  fun `getPermissionLevelName should return User when permission level is USER`() {
    // Arrange
    val permissionManager = PermissionManager()
    val permissionLevel = PermissionLevel.USER

    // Act
    val result = permissionManager.getPermissionLevelName(permissionLevel)

    // Assert
    assert(result == "User")
  }

  @Test
  fun `setPermissionLevel should set permission level to ADMIN`() {
    // Arrange
    val permissionManager = PermissionManager()
    val permissionLevel = PermissionLevel.ADMIN

    // Act
    permissionManager.setPermissionLevel(permissionLevel)

    // Assert
    assert(permissionManager.getPermissionLevelName(permissionLevel) == "Admin")
  }

  @Test
  fun `setPermissionLevel should set permission level to DEVELOPER`() {
    // Arrange
    val permissionManager = PermissionManager()
    val permissionLevel = PermissionLevel.DEVELOPER

    // Act
    permissionManager.setPermissionLevel(permissionLevel)

    // Assert
    assert(permissionManager.getPermissionLevelName(permissionLevel) == "Developer")
  }

  @Test
  fun `setPermissionLevel should set permission level to USER`() {
    // Arrange
    val permissionManager = PermissionManager()
    val permissionLevel = PermissionLevel.USER

    // Act
    permissionManager.setPermissionLevel(permissionLevel)

    // Assert
    assert(permissionManager.getPermissionLevelName(permissionLevel) == "User")
  }
}