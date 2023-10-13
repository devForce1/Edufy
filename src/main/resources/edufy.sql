CREATE DATABASE edufy;
USE edufy;

CREATE TABLE Artist (
    artistID INT AUTO_INCREMENT PRIMARY KEY,
    artistName VARCHAR(50) NOT NULL,
    artistFollowers INT NOT NULL DEFAULT 0
);

CREATE TABLE Genres (
    genresID INT AUTO_INCREMENT PRIMARY KEY,
    genres VARCHAR(50) NOT NULL
);

CREATE TABLE Album (
    albumID INT AUTO_INCREMENT PRIMARY KEY,
    albumTitle VARCHAR(50) NOT NULL,
    artistID INT,
    releaseYear YEAR,
    FOREIGN KEY (artistID) REFERENCES Artist(artistID)
);

CREATE TABLE Music (
    musicID INT AUTO_INCREMENT PRIMARY KEY,
    musicTitle VARCHAR(50) NOT NULL,
    artistID INT,
    genresID INT,
    albumID INT,
    releaseDate DATE,
    FOREIGN KEY (artistID) REFERENCES Artist(artistID),
    FOREIGN KEY (genresID) REFERENCES Genres(genresID),
    FOREIGN KEY (albumID) REFERENCES Album(albumID)
);

CREATE TABLE Pod (
    podID INT AUTO_INCREMENT PRIMARY KEY,
    podTitle VARCHAR(50) NOT NULL,
    artistID INT,
    genresID INT,
    albumID INT,
    releaseDate DATE,
    FOREIGN KEY (artistID) REFERENCES Artist(artistID),
    FOREIGN KEY (genresID) REFERENCES Genres(genresID),
    FOREIGN KEY (albumID) REFERENCES Album(albumID)
);

CREATE TABLE Video (
    videoID INT AUTO_INCREMENT PRIMARY KEY,
    videoTitle VARCHAR(50) NOT NULL,
    artistID INT,
    genresID INT,
    albumID INT,
    releaseDate DATE,
    FOREIGN KEY (artistID) REFERENCES Artist(artistID),
    FOREIGN KEY (genresID) REFERENCES Genres(genresID),
    FOREIGN KEY (albumID) REFERENCES Album(albumID)
);

CREATE TABLE User (
    userID INT AUTO_INCREMENT PRIMARY KEY,
    userName VARCHAR(50) NOT NULL,
    userEmail VARCHAR(50) UNIQUE NOT NULL,
    userSubscription VARCHAR(50) NOT NULL
);

CREATE TABLE User_PlayHistory (
    historyID INT AUTO_INCREMENT PRIMARY KEY,
    userID INT,
    musicID INT,
    podID INT,
    videoID INT,
    FOREIGN KEY (userID) REFERENCES User(userID),
    FOREIGN KEY (musicID) REFERENCES Music(musicID),
    FOREIGN KEY (podID) REFERENCES Pod(podID),
    FOREIGN KEY (videoID) REFERENCES Video(videoID)
);

CREATE TABLE Ratings (
    ratingID INT AUTO_INCREMENT PRIMARY KEY,
    userID INT,
    mediaID INT,  -- can be musicID, podID, or videoID
    mediaType VARCHAR(10),  -- can be 'music', 'pod', or 'video'
    rating VARCHAR(10) CHECK (rating IN ('thumbs_up', 'thumbs_down')),
    FOREIGN KEY (userID) REFERENCES User(userID),
    UNIQUE (userID, mediaID, mediaType)  -- can only rate a media type once
);

-----------------------------------------------------------------------------------


-- Artist Data
INSERT INTO Artist(artistName, artistFollowers) VALUES('The Beatles', 5000000);
INSERT INTO Artist(artistName, artistFollowers) VALUES('Coldplay', 3000000);
INSERT INTO Artist(artistName, artistFollowers) VALUES('Taylor Swift', 4000000);

-- Genres Data
INSERT INTO Genres(genres) VALUES('Rock');
INSERT INTO Genres(genres) VALUES('Pop');
INSERT INTO Genres(genres) VALUES('Country');

-- Album Data
INSERT INTO Album(albumTitle, artistID, releaseYear) VALUES('Abbey Road', 1, 1969);
INSERT INTO Album(albumTitle, artistID, releaseYear) VALUES('Viva la Vida', 2, 2008);
INSERT INTO Album(albumTitle, artistID, releaseYear) VALUES('1989', 3, 2014);

-- Music Data
INSERT INTO Music(musicTitle, artistID, genresID, albumID, releaseDate) VALUES('Come Together', 1, 1, 1, '1969-09-26');
INSERT INTO Music(musicTitle, artistID, genresID, albumID, releaseDate) VALUES('Viva la Vida', 2, 1, 2, '2008-06-12');
INSERT INTO Music(musicTitle, artistID, genresID, albumID, releaseDate) VALUES('Shake It Off', 3, 2, 3, '2014-08-18');

-- Pod Data
INSERT INTO Pod(podTitle, artistID, genresID, albumID, releaseDate) VALUES('Podcast Ep1', 1, 2, 1, '2020-01-10');
INSERT INTO Pod(podTitle, artistID, genresID, albumID, releaseDate) VALUES('Podcast Ep2', 2, 2, 2, '2020-02-15');
INSERT INTO Pod(podTitle, artistID, genresID, albumID, releaseDate) VALUES('Podcast Ep3', 3, 3, 3, '2020-03-20');

-- Video Data
INSERT INTO Video(videoTitle, artistID, genresID, albumID, releaseDate) VALUES('Music Video 1', 1, 1, 1, '2010-10-10');
INSERT INTO Video(videoTitle, artistID, genresID, albumID, releaseDate) VALUES('Music Video 2', 2, 1, 2, '2011-11-11');
INSERT INTO Video(videoTitle, artistID, genresID, albumID, releaseDate) VALUES('Music Video 3', 3, 2, 3, '2012-12-12');

