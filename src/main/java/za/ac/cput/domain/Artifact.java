/* Artifact.java
Artifact POJO class
Author: Y JILAJI (222582731)
Date: 11 May 2025 */
package za.ac.cput.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import za.ac.cput.domain.enums.MaterialLocation;
import za.ac.cput.domain.enums.Materials;

import java.time.LocalDate;
@Entity
public class Artifact {
    @Id
    private String artifactId;
    private String name;
    private String description;
    private LocalDate dateOfOrigin;
    private String condition;
    private Materials material;
    private MaterialLocation location;

    public Artifact() {
    }

    private Artifact(Builder builder) {
        this.artifactId = builder.artifactId;
        this.name = builder.name;
        this.description = builder.description;
        this.dateOfOrigin = builder.dateOfOrigin;
        this.condition = builder.condition;
        this.material = builder.material;
        this.location = builder.location;
    }

    public String getArtifactId() {

        return artifactId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {

        return description;
    }

    public LocalDate getDateOfOrigin() {
        return dateOfOrigin;
    }


    public String getCondition() {

        return condition;
    }

    public Materials getMaterial() {
        return material;
    }

    public MaterialLocation getLocation()
    {
        return location;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "artifactId='" + artifactId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateOfOrigin=" + dateOfOrigin +
                ", condition='" + condition + '\'' +
                ", material=" + material +
                ", location=" + location +
                '}';
    }



    public static class Builder {
        private String artifactId;
        private String name;
        private String description;
        private LocalDate dateOfOrigin;
        private String condition;
        private Materials material;
        private MaterialLocation location;

        public Builder setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDateOfOrigin(LocalDate dateOfOrigin) {
            this.dateOfOrigin = dateOfOrigin;
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setMaterial(Materials material) {
            this.material = material;
            return this;
        }

        public Builder setLocation(MaterialLocation location) {
            this.location = location;
            return this;
        }

        public Builder copy(Artifact art) {
            this.artifactId = art.artifactId;
            this.name = art.name;
            this.description = art.description;
            this.dateOfOrigin = art.dateOfOrigin;
            this.condition = art.condition;
            this.material = art.material;
            this.location = art.location;
            return this;
        }

        public Artifact build() {

            return new Artifact(this);
        }
    }


}