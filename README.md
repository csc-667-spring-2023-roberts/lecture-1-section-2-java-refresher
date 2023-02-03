### Java Refresher

#### Requirements

1. Read some content from a structured file

   ```
   Itsa me mario
   An-Item: item in list
   Another-Item: another thing

   This is some content in the file
   ```

2. Store that information into an object
3. See how this relates to sockets?

#### Implementation Plan

FileReader

- Open the file and read the structured data, generate FileContent
- Fields (members):
  - `BufferedReader reader` (created from a path passed to class)
- Operations (methods):
  - `FileContent read()`

FileContent class

- Responsible for storing the file data
- Fields (members):
  - `String introduction`
  - `Map<String, String> list`
  - `String body`
- Operations (methods):
  - `String toString()`
  - `void setIntroduction(String newIntroduction)`
  - `void addToList(String key, String value)`
  - `void setBody(String newBody)`

Something to test with

- Driver?
