# CustoMIUIzerMod
[![Download](https://img.shields.io/github/downloads/liyafe1997/CustoMIUIzerMod/total?label=Release%20Download)](https://github.com/liyafe1997/CustoMIUIzerMod/releases)
## English 
[简体中文](#%E7%AE%80%E4%BD%93%E4%B8%AD%E6%96%87-simplified-chinese)

### For Android 12 and above

This project will not adopt Android 12+ since someone is doing that. If you are using Android 12+ based MIUI you can check: https://github.com/MonwF/customiuizer

This project will focus on Android 11 based MIUI, especially MIUI12.5 & 13

### Introduction 
This project is based on [Mikanoshi's CustoMIUIzer](https://code.highspec.ru/Mikanoshi/CustoMIUIzer), since the original CustoMIUIzer haven't adapted MIUI12.5 & Android 11 yet for a long time, this mod is targeting at adapting higher version of Android and MIUI. 


Currently I have no plan to add new features to this mod, only target at make it works on Android 11 based MIUI 12.5/13. If you found something doesn't work or unexpeted whatever on A11, MIUI12.5/13, you are welcome to submit issues. (Theoretically, the compatibility of mods is mainly related to the Android version and less related to the MIUI version, so most of mods should work without workaround for MIUI13 with Android 11 and below.)


Also, if you have solutions for the workaound, you are welcomed to sumbit pull request.  

### List of fix in CustoMIUIzerMod
Note: Mods are not listed here not means it can't work work with higher version of MIUI and Android. These mods are the mods not work with higher version OS in original CustoMIUIzer, and be fixed in CustoMIUIzerMod. For this moment, I don't have time to test each mods whether it works or not one by one, so if you find any mods doesn't work, you are welcomed to sumbit issues.

1. Mod: Navigation bar custom (left/right) key

2. Mod: Detailed network speed indicator in statusbar

3. Mod: Screenshot Config

4. Mod: Custom network speed indicator update interval

5. Mod: Hide app from recent list

6. Mod: Remove unlock icon animation on launcher

7. Mod: Show Seconds

8. Mod: Music Visualizer

9. Mod: Hide Navbar

10. Mod: Battery bar indicator

11. Backup/Restore Settings: Use Document Provider to load/save backup file instead of hard coded the path. For compatible with Android 11's new storage policy.

### How to migrate settings from original CustoMIUIzer

If you are using Play Store's version of CustoMIUIzer, please download and install (just overwrite it, DO NOT uninstall firstly, otherwise you will lost all your settings) a standalone APK version from [Original CustoMIUIzer Release Page](https://code.highspec.ru/Mikanoshi/CustoMIUIzer/releases) or LSPosed repo. The reason is Play Store's version of CustoMIUIzer has updated the target API to 30 (Android11), but have not updated the backup/restore implementation. Due to the Android 11's new storage policy, it unable to save settings to your phone storage (But you can still have a try firstly) . 

1. Open the Original CustoMIUIzer, click the three-dots button in the top-right corner, then "Settings management".

2. Click "Backup"

3. Go to your file manager app, check the backup file "/CustoMIUIzer/settings_backup" existed or not. If the backup succeed, you can uninstall the original version CustoMIUIzer.

4. Install CustoMIUIzerMod, activate it in LSPosed and then reboot.

5. Open CustoMIUIzerMod, click three-dots menu, "Settings management", "Restore", then select the backup file "/CustoMIUIzer/settings_backup".

6. Done. Now you should reboot your phone to apply your new settings.

### About Versions and futher updates

For the version number, it start from 1.0, and the last three number is the based version of original CustoMIUIzer. E.g. 1.0.321 means this 1.0 version is based on CustoMIUIzer 3.2.1. I will merge updates from the upstram (original CustoMIUIzer) depends on the situation.

## 简体中文 (Simplified Chinese)

### Android 12及以上版本

该项目不会去适配Android 12+，因为已经有别的项目在做了，如果你在使用Android12及以上版本可以看看这个项目：https://github.com/MonwF/customiuizer

该项目主要是适配基于Android 11的MIUI12.5/13

### 简介

该项目基于原版[Mikanoshi's CustoMIUIzer](https://code.highspec.ru/Mikanoshi/CustoMIUIzer)，由于原版好久没有更新适配MIUI12.5 & Android 11，而且从跟他在issue板交流的回复情况看，那位老哥短时间内似乎没有适配高版本MIUI&Android的计划。已经快一年了，实在等不及，于是决定自己动手。

当前我并没有计划添加新功能，主要还是适配Android 11 & MIUI 12.5/13。如果你发现有Mod在Android11，MIUI12.5/13下无法正常工作，欢迎提Issue。（理论上，模块兼容性主要与Android版本相关性较大，与MIUI版本相关性较小，所以对于Android11及以下的MIUI13应该不需做额外适配）

来自酷安的老哥欢迎在酷安@Strawing提问题。之后打算上架酷安，目前正在申请开发者认证，还在审核中。

并且，如果你懂Android开发，有好的适配方案，欢迎直接提交pull request。

### CustoMIUIzerMod修改列表
Note: 不在本列表中的Mods并不意味着在高版本的Android和MIUI中无法正常工作，因为原先很多Mod也是可以用的。下面列出的Mod是原版CustoMIUIzer无法在高版本的系统上工作，本项目修复了的。目前我没有时间一个个功能去测在高版本系统上能否使用，所以截止目前我只修了我自己最常用的几个Mods，因此如果你发现有任何Mods无法正常工作，欢迎提issue。

1. Mod: 导航栏自定义左右键

2. Mod: 状态栏详细的网速指示器

3. Mod: 截图配置

4. Mod: 自定义网速更新间隔

5. Mod: 最近应用列表隐藏指定App

6. Mod: 去除解锁图标动画

7. Mod: 显示秒

8. Mod: 音乐可视化

9. Mod: 隐藏导航栏

10. Mod: 电池条指示器

11. 备份/还原设置：用Document Provider API来读写备份文件，而不是原先的写死路径的方法，目的是兼容Android 11的新存储策略。

### 如何把设置从原版CustoMIUIzer迁移到CustoMIUIzerMod

如果你是从Google Play安装的CustoMIUIzer，你需要从[原版CustoMIUIzer Release](https://code.highspec.ru/Mikanoshi/CustoMIUIzer/releases)或者LSPosed仓库中下载独立APK版本的CustoMIUIzer，来覆盖安装（不要卸载，不然你的设置全没了）。原因是因为Google Play的政策，上架Play商店的版本Target API更新到了30（Android11），然而原作者并没有更新实现备份还原的逻辑，还是用写死路径的方法，这与Android11新的存储策略不兼容，导致在Android11上没有存储权限，无法备份设置（不过你可以尽管先试一试，不行再装apk）。

1. 打开原版CustoMIUIzer，点击右上角三个点，然后「设置管理」。

2. 点击「备份」

3. 打开你的文件管理App，检查下备份文件「/CustoMIUIzer/settings_backup」是否存在，如果备份成功，你可以卸载原版CustoMIUIzer了。

4. 安装CustoMIUIzerMod，在LSPosed中激活，然后重启。

5. 打开CustoMIUIzerMod，点击右上角三个点，「设置管理」，「还原」，然后选择备份文件「/CustoMIUIzer/settings_backup」。

6. 完成。此时需重启以应用新设置。

### 关于版本号及以后的更新

CustoMIUIzerMod版本号从1.0开始，最后三位数为基于CustoMIUIzer的版本，比如1.0.321意为基于CustoMIUIzer 3.2.1。后续上游原版CustoMIUIzer的更新我会视情况merge过来。
