package nl.patrickdev.audio;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Note {

    private double frequency;
    private double duration;

}
