package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.model.MockModel;
import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class VetControllerTest {

    VetController vetController;

    @BeforeEach
    void setUp() {

        // Use VetMapService - add two or more vets
        VetService mockVetService = new VetMapService(null);

        Vet vet1 = new Vet(1L, "Vilau", "George", new HashSet<Speciality>());
        Vet vet2 = new Vet(2L, "Vilau", "Ciprian", new HashSet<Speciality>());

        mockVetService.save(vet1);
        mockVetService.save(vet2);

        vetController = new VetController(mockVetService);

    }

    @DisplayName(value="List Vets")
    @Test
    void listVets() {

        Model mockModel = new MockModel();

        assertThat(vetController.listVets(mockModel)).isEqualTo("vets/index");

        assertThat(((Set<Vet>)((MockModel) mockModel).getValues().get("vets")).size()).isEqualTo(2);

    }
}