class PermissionManager {
    private var mCurrentLevel: PermissionLevel = PermissionLevel.USER

    fun getPermissionLevelName(): String {
        return when (mCurrentLevel) {
            PermissionLevel.ADMIN -> "Admin"
            PermissionLevel.DEVELOPER -> "Developer"
            PermissionLevel.USER -> "User"
        }
    }

    fun setPermissionLevel(permissionLevel: PermissionLevel) {
        mCurrentLevel = permissionLevel
    }
}