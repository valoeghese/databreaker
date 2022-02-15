# DataBreaker
DataBreaker speeds up your minecraft loading time by stopping the execution of DataFixerUpper.
As you can imagine this is very hacky and stops world backwards compatibility. This tool is intended for MOD DEVS ONLY.
Do not use it in a normal Minecraft environment unless you have severe brain damage or are otherwise completely crazy. Or are me, because I swear I'm only a *little* crazy for using it in some of my runtime environments.
<br/>
<br/>

## How to add this mod to your development environment
If you have the inclination to add my fork of databreaker to your dev env, follow these 3 easy steps:  

### 1. Use SuperCoder7979's version instead

Seriously, it has more safety precautions. I removed a bunch so I could do concerning things.

### 2. add this to your build script before `dependencies`:  
:exclamation:Note: do ***NOT*** put it in the `publishing` section

```gradle
maven { url 'https://jitpack.io' }
```

### 3. add this to your build script in `dependencies`:

For `databreaker_version` use the latest release version number which can be found in github releases.

```gradle
modRuntime ("com.github.valoeghese:databreaker:${databreaker_version}") {
	exclude module: "fabric-loader"
}
```

## How to use this at runtime!

Why on earth would you want to do this

### 1. Use LazyDFU instead

https://www.curseforge.com/minecraft/mc-mods/lazydfu

### 2. If you really don't want LazyDFU, use SuperCoder7979's original version of databreaker

It has more safety precautions, such as not even letting you use it at runtime unless you use a special flag you can find if you know how to read code.

Seriously you don't want to use my fork it has 10x less safety.

### 3. Ok, I want to destroy my world and blame the wrong individual for it though!

Uh ok. It's literally the normal mod building procedure, then just chuck the jar in your mods folder. If you know anything about fabric mods you know how to do this. It's simple. Scarily simple.
