package pl.dkowal.domain;

/**
 * Created by Dawid on 2017-05-06.
 */
public enum Status {

    NOWA("Nowa"),
    DO_SPRZEDANIA("Do sprzedania"),
    NIE_DO_SPREDANIA("Nie do sprzedania");

    public static final Status[] ALL = { NOWA, DO_SPRZEDANIA, NIE_DO_SPREDANIA };


    private final String name;

    private Status(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
