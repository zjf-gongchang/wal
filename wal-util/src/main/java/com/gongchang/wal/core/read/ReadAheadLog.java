package com.gongchang.wal.core.read;

import java.io.IOException;
import java.util.Iterator;

public interface ReadAheadLog<T> {

    Iterator<String> readLog() throws IOException;

}
