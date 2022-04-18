package org.frcteam2910.c2020.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import org.frcteam2910.c2020.Constants;
import org.frcteam2910.c2020.subsystems.Indexer;
import org.frcteam2910.c2020.subsystems.Intake;
import org.frcteam2910.c2020.subsystems.Shooter;

public class EjectBallsAuton extends SequentialCommandGroup {

    public EjectBallsAuton(Intake intake, Indexer indexer, Shooter shooter) {
        addCommands(
                new IntakeSetRPM(intake, -500),
                new IndexerSetRPM(indexer, -500)
        );
    }
}