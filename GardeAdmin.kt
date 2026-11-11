package cg.garde.dns2

import android.app.admin.DeviceAdminReceiver

/** Tant que cette app est "administrateur", Android refuse de la désinstaller. */
class GardeAdmin : DeviceAdminReceiver()
