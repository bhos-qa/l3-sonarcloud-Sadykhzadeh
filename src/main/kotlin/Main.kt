fun main() {
    val permissionManager = PermissionManager()
    permissionManager.setPermissionLevel(PermissionLevel.ADMIN)
    println("Current permission level: ${permissionManager.getPermissionLevelName()}")
}
