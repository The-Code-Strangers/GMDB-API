// package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

// import static org.hamcrest.Matchers.hasSize;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.http.MediaType;
// import org.springframework.test.web.servlet.MockMvc;


// import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
// import net.thecodestrangers.GalvanizeMovieDatabaseAPI.services.ReviewService;

// /**
//  * reviewControllerTest
//  */

// @WebMvcTest
// public class reviewControllerTest {

//     @Autowired
//     private MockMvc mvc;

//     @MockBean
//     ReviewService reviewServiceMock;

    
// @Test
// void showAllReviews() throws Exception{
//     List<Review> reviewList = new ArrayList<>();
//     Review review1 = new Review(1L,1L,"First Heading", "First Content", 3 );
//     Review review2 = new Review(1L,2L,"Second Heading", "Second Content", 5 );
//     Review review3 = new Review(2L,1L,"First Heading Second Movie", "First Content", 5 );
//     reviewList.addAll(Arrays.asList(review1, review2, review3));
//     when(reviewServiceMock.getEntries()).thenReturn(reviewList);
//     mvc.perform(get("/reviews")).andExpect(status().isOk())
//     .andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$").isArray())
//     .andExpect(jsonPath("$", hasSize(3)));
//     verify(reviewServiceMock.getEntries());
// }

    
// }