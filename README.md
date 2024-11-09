# FightOppoInstaller

因为Oppo自带的Installer太抽象了——如果通过ADB，或者相对Oppo而言来源是“不安全”的比如tg，要你登录Oppo账号后才能安装

其实如果通过“不安全”的来源，可以通过第三方Installer来绕过限制，但如果是通过ADB使用第三方会卡权限（也不清楚为什么授权了root还无权限），这严重影响我的开发工作

_凭什么我安装个应用还必须听你的，这是我的手机！关键是这几年以来已经形成趋势，而且以前还可以关闭这个检测现在是已经没法关了（_

也感谢[LeadroyaL](https://leadroyal.cn/p/1151/)提供相关研究资料，并经过测试可行，目前我已经将其改造出一个模块，希望也是被Oppo自带Installer折磨的家人们可以从中得到解放

## 使用限制

该模块仅限于使用ColorOS的Oppo、Realme、OnePlus系手机，并安装了Xposed模块。如果不是上述用户**请不要**使用，避免出现不可预知的问题

## 使用方法

前往[Release](releases/latest)下载最新版本并安装，选择推荐的作用域（**不要选择其他作用域！**）后激活模块即可绕过登录要求

## 鸣谢

[LeadroyaL](https://leadroyal.cn/p/1151/)的研究成果以及相关核心代码
