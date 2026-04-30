package net.ddns.mindustry.cina.command

import arc.util.Log

class CommandClassLoader : ClassLoader() {
//    @Override protected Class<?> loadClass(String name, boolean resolve) throws
//    ClassNotFoundException {
//        if(name belongs to java classes) {
//            return super.loadClass(name, resolve);
//        }
//        byte[] b = ..// read bytes from your .class files. or use getResourceAsStream(name)
//                Class<?> c = defineClass(b, name);
//        if(resolve) resolveClass(c);
//        return c;
//    }

    override fun loadClass(name: String?): Class<*>? {
        Log.info(name)
        return super.loadClass(name)
    }
}