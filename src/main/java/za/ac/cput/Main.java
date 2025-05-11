package za.ac.cput;

import za.ac.cput.domain.domain.Artifact;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
       Artifact art = new Artifact.Builder()
               .setArtifactId("001")
               .setName("ArtifactName")
               .setDescription("")
               .setDateOfOrigin(LocalDate.parse("2003-02-11"))
               .setCondition("Bad")
                .build();

        System.out.println(art.toString());
    }
}