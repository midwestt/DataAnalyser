package ru.com.analyse;

import ru.com.analyse.data.*;
import ru.com.analyse.domain.PersonRepository;
import ru.com.analyse.domain.PersonRepositoryImpl;
import ru.com.analyse.ui.PersonAdapter;

public class ServiceFactory {
    public static FileHandler createFileHandler() { return new FileHandlerImpl(); }
    public static FileParser createFileParser() { return  new FileParserImpl(); }
    public static PersonFinder createPersonFinder() { return new PersonFinderImpl(); }
    public static FileStatistics createFileStatistics() { return new FileStatisticsImpl(); }
    public static PersonRepository createRepository() {
        return new PersonRepositoryImpl(createFileHandler(), createFileParser(),
                createPersonFinder(), createFileStatistics());
    }
    public static PersonAdapter createAdapter() {
        return new PersonAdapter(createRepository());
    }
}
