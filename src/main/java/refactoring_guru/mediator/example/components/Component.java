package refactoring_guru.mediator.example.components;

import refactoring_guru.mediator.example.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
