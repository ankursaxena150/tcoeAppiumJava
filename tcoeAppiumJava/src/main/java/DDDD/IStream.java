package DDDD;

import com4j.IID;
import com4j.VTID;

@IID("{0000000C-0000-0000-C000-000000000046}")
public interface IStream extends DDDD.ISequentialStream {
  // Methods:
      /**
       * @param grfCommitFlags Mandatory int parameter.
       */

      @VTID(8)
      void commit(
              int grfCommitFlags);


      /**
       */

      @VTID(9)
      void revert();


          /**
           * @return  Returns a value of type DDDD.IStream
           */

          @VTID(13)
          IStream clone();


          // Properties:
        }
