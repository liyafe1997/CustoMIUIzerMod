# CustoMIUIzerMod

## English 

### Introduction 
This project is based on [Mikanoshi's CustoMIUIzer](https://code.highspec.ru/Mikanoshi/CustoMIUIzer), since the original CustoMIUIzer haven't adapted MIUI12.5 & Android 11 yet for a long time, this mod is targeting at adapting higher version of Android and MIUI. 


Currently I have no plan to add new features to this mod, only target at make it works on higher version of MIUI and Android. Even Android 12 & MIUI 13 is in the plan, but for this moment I will focus on Android 11 & MIUI 12.5. If you found something doesn't work or unexpeted whatever on A11/A12, MIUI12.5/13, you are welcome to submit issues, but I will deal with problems of Android12/MIUI13 later.


Also, if you have solutions for the workaound, you are welcomed to sumbit pull request.  

### List of fix in CustoMIUIzerMod
Note: Mods are not listed here not means it can't work work with higher version of MIUI and Android. These mods are the mods not work with higher version OS in original CustoMIUIzer, and be fixed in CustoMIUIzerMod. For this moment, I don't have time to test each mods whether it works or not one by one, so if you find any mods doesn't work, you are welcomed to sumbit issues.

1. Mod: Navigation bar custom (left/right) key

2. Mod: Detailed network speed indicator in statusbar

3. Mod: Screenshot Config

4. Mod: Custom network speed indicator update interval

5. Backup/Restore Settings: Use Document Provider to load/save backup file instead of hard coded the path. For compatible with Android 11's new storage policy.

### How to migrate settings from original CustoMIUIzer

If you are using Play Store's version of CustoMIUIzer, please download and install (just overwrite it, DO NOT uninstall firstly, otherwise you will lost all your settings) a standalone APK version from [Original CustoMIUIzer Release Page](https://code.highspec.ru/Mikanoshi/CustoMIUIzer/releases) or LSPosed repo. The reason is Play Store's version of CustoMIUIzer has updated the target API to 30 (Android11), but have not updated the backup/restore implementation. Due to the Android 11's new storage policy, it unable to save settings to your phone storage. (You can just have a try) 

1. Open the Original CustoMIUIzer, click the three-dots button in the top-right corner, then "Settings management".

2. Click "Backup"

3. Go to your file manager app, check the backup file "/CustoMIUIzer/settings_backup" existed or not. If the backup succeed, you can uninstall the original version CustoMIUIzer.

4. Install CustoMIUIzerMod, activate it in LSPosed and then reboot.

5. Open CustoMIUIzerMod, click three-dots menu, "Settings management", "Restore", then select the backup file "/CustoMIUIzer/settings_backup".

6. Done.