

/**
 * Image meta data
 */
export interface ImageMeta {

    /**
     * ID of the image
     */
    id: string;

    /**
     * Caption of the image
     */
    caption: string;

    /**
     * Mime type of the image
     */
    mimeType: string;

    /**
     * Height of the image
     */
    height: number;

    /**
     * Width of the image
     */
    width: number;

    /**
     * Image poster ID
     */
    userId: string;

    /**
     * Users tagged into the caption of the photo
     */
    userTags: string[];

    /**
     * Hash tags within the caption of the photo
     */
    hashTags: string[];

    /**
     * Creatd at timestap
     */
    createdAt: string;

    /**
     * Like count
     */
    likes: number;
}
