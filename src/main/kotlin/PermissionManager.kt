class PermissionManager {
    private var mCurrentLevel: PermissionLevel = PermissionLevel.USER

    fun getPermissionLevelName(permissionLevel: PermissionLevel): String {
        return when (permissionLevel) {
            PermissionLevel.ADMIN -> "Admin"
            PermissionLevel.DEVELOPER -> "Developer"
            PermissionLevel.USER -> "User"
        }
    }

    fun setPermissionLevel(permissionLevel: PermissionLevel) {
        mCurrentLevel = permissionLevel
    }
}